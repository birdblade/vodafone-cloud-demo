#!/bin/bash
cd productservice
mvn package docker:build -DskipTests